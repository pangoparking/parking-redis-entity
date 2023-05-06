package org.parking;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.*;

@RedisHash
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

public class FineRedisEntity {
    @Id
	public long CarId;
    public LocalDateTime fineTime;
    public boolean fined;
   
 
}