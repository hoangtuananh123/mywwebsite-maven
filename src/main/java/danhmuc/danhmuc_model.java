package danhmuc;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class danhmuc_model  extends AbstractTableModel{

	private ArrayList<danhmuc> dm;
	private Object [][] data;

	public danhmuc_model(ArrayList<danhmuc> dm) {
		super();
		this.dm = dm;
		data= new Object[dm.size()][];
		for(int i =0; i< data.length;i++) {
			danhmuc danhm = dm.get(i);
			Object [] row = {danhm.getIddanhmuc(),danhm.getTendanhmuc(),danhm.getMota()};
			data[i]= row;
		}
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return data[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}
	

}
