package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dao.ExampleDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0tzer
 */
public final class lorannModel implements IModel {

	int map;
	int world;
    /**
     * Instantiates a new model facade.
     */
    public lorannModel() {
        super();
    }
    public void  getMap() {};
    public void setMap() {};
    
    public ArrayList<Imobile > getMobiles () {
		return null;
	}
   
    public void setMobile () {};
    public ArrayList <Iimmobile> getImmobile() {
    	return null;
    }
    
    public void setImmobile() {};
    
    
    ;
    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleById(int)
     */
    @Override
    public Example getExampleById(final int id) throws SQLException {
        return ExampleDAO.getExampleById(id);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getExampleByName(java.lang.String)
     */
    @Override
    public Example getExampleByName(final String name) throws SQLException {
        return ExampleDAO.getExampleByName(name);
    }

    /*
     * (non-Javadoc)
     * @see model.IModel#getAllExamples()
     */
    @Override
    public List<Example> getAllExamples() throws SQLException {
        return ExampleDAO.getAllExamples();
    }

}
