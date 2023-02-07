package commands;

import worker.MapWorker;

public class FilterBySalary extends CommandWithArg {
    public FilterBySalary() {
        super("������� ��������, �������� ���� salary ������� ����� ���������");
    }

    @Override
    public void execute() {
        for (Long id : MapWorker.getWorkers().keySet()) {
            if (MapWorker.getWorkers().get(id).getSalary() == Double.parseDouble(this.arg))
                System.out.println(MapWorker.getWorkers().get(id).toString());
        }
    }
}
