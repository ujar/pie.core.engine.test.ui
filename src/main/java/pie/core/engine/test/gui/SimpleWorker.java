package pie.core.engine.test.gui;


import java.util.List;
import java.util.concurrent.TimeUnit;
import pie.core.adapter.AbstractWorkerAdapter;
import pie.core.adapter.IWorkerAdapter;
import pie.core.engine.Event;

/**
 *
 * @author Saiful.I Raju
 * @email saiful.raju@gmail.com
 * 
 */
public class SimpleWorker extends AbstractWorkerAdapter{

    
    
    
    @Deprecated
    public SimpleWorker() {
        this.setWakeupDelay(120);
        this.setTimeUnit(TimeUnit.SECONDS);
    }

    public SimpleWorker(long wakeupDelay, TimeUnit timeUnit) {
        this.setWakeupDelay(wakeupDelay);
        this.setTimeUnit(timeUnit);
    }
    
    @Override
    public <T extends IWorkerAdapter> T getWorkerId() {
        return (T) this;
    }

    @Override
    public List<Event> loadRealTime() {
        //
        return null;
    }

    @Override
    public List<Event> loadFromPersistant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Event> save(List<Event> events) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Event get(Long eventId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
