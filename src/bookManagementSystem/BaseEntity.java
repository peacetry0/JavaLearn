package bookManagementSystem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class BaseEntity {

    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private static final  DateTimeFormatter formatter =DateTimeFormatter.ofPattern("\"yyyy-MM-dd HH:mm:ss \"");

    public BaseEntity() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.deletedAt = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        this.createdAt = LocalDateTime.now() ;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    @Override
    public String toString() {


        return "BaseEntity{" +
                "id=" + id +
                ", createdAt=" + createdAt.format(formatter) +
                ", updatedAt=" + updatedAt.format(formatter) +
                '}';
    }
}
