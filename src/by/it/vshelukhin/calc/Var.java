package by.it.vshelukhin.calc;

public abstract class Var implements Operation {
    @Override
    public Var add(Var other) throws CalcException {
        throw new CalcException(String.format("Сложение %s + %s невозможно.",this,other));
    }

    @Override
    public Var sub(Var other) throws CalcException {
        throw new CalcException(String.format("Вычитание %s - %s невозможно.",this,other));
    }

    @Override
    public Var mul(Var other) throws CalcException {
        throw new CalcException(String.format("Умножение %s * %s невозможно.",this,other));
    }

    @Override
    public Var div(Var other) throws CalcException {
        throw new CalcException(String.format("Деление %s / %s невозможно.",this,other));
    }

    public void assign (String name) throws CalcException {
        throw new CalcException("Операция присваивания невозможна");
    }

    static Var createVar (String operand) throws CalcException {
        if (Data.data.containsKey(operand)) return Data.data.get(operand);
        if (operand.matches(Patterns.SCALAR)) return new Scalar(operand);
        if (operand.matches(Patterns.VECTOR)) return new Vector(operand);
        if (operand.matches(Patterns.MATRIX)) return new Matrix(operand);
        throw new CalcException("Ошибка ввода операнда!"+operand);
    }
}
