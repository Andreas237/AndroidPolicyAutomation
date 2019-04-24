.class public Lo/fmy;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static b(Lo/fmw;)V
    .locals 6

    .line 146
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v3

    .line 147
    const-string v0, "os.name"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 148
    const-string v0, "Windows"

    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    .line 150
    const-string v0, "MAX_ACTIVE_PEERS"

    const v1, 0x249f0

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 151
    const-string v0, "MAX_PEER_INACTIVITY_PERIOD"

    const-wide/16 v1, 0x258

    invoke-virtual {p0, v0, v1, v2}, Lo/fmw;->a(Ljava/lang/String;J)Lo/fmw;

    .line 153
    const-string v0, "COAP_PORT"

    const/16 v1, 0x1633

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 154
    const-string v0, "COAP_SECURE_PORT"

    const/16 v1, 0x1634

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 156
    const-string v0, "ACK_TIMEOUT"

    const/16 v1, 0x7d0

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 157
    const-string v0, "ACK_RANDOM_FACTOR"

    const/high16 v1, 0x3fc00000    # 1.5f

    invoke-virtual {p0, v0, v1}, Lo/fmw;->e(Ljava/lang/String;F)Lo/fmw;

    .line 158
    const-string v0, "ACK_TIMEOUT_SCALE"

    const/high16 v1, 0x40000000    # 2.0f

    invoke-virtual {p0, v0, v1}, Lo/fmw;->e(Ljava/lang/String;F)Lo/fmw;

    .line 159
    const-string v0, "MAX_RETRANSMIT"

    const/4 v1, 0x4

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 160
    const-string v0, "EXCHANGE_LIFETIME"

    const-wide/32 v1, 0x3c4d8

    invoke-virtual {p0, v0, v1, v2}, Lo/fmw;->a(Ljava/lang/String;J)Lo/fmw;

    .line 161
    const-string v0, "NON_LIFETIME"

    const-wide/32 v1, 0x23668

    invoke-virtual {p0, v0, v1, v2}, Lo/fmw;->a(Ljava/lang/String;J)Lo/fmw;

    .line 162
    const-string v0, "MAX_TRANSMIT_WAIT"

    const-wide/32 v1, 0x16b48

    invoke-virtual {p0, v0, v1, v2}, Lo/fmw;->a(Ljava/lang/String;J)Lo/fmw;

    .line 163
    const-string v0, "NSTART"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 164
    const-string v0, "LEISURE"

    const/16 v1, 0x1388

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 165
    const-string v0, "PROBING_RATE"

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, v1}, Lo/fmw;->e(Ljava/lang/String;F)Lo/fmw;

    .line 167
    const-string v0, "USE_RANDOM_MID_START"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lo/fmw;->e(Ljava/lang/String;Z)Lo/fmw;

    .line 168
    const-string v0, "MID_TACKER"

    const-string v1, "GROUPED"

    invoke-virtual {p0, v0, v1}, Lo/fmw;->d(Ljava/lang/String;Ljava/lang/String;)Lo/fmw;

    .line 169
    const-string v0, "MID_TRACKER_GROUPS"

    const/16 v1, 0x10

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 170
    const-string v0, "TOKEN_SIZE_LIMIT"

    const/16 v1, 0x8

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 172
    const-string v0, "PREFERRED_BLOCK_SIZE"

    const/16 v1, 0x200

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 173
    const-string v0, "MAX_MESSAGE_SIZE"

    const/16 v1, 0x400

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 174
    const-string v0, "MAX_RESOURCE_BODY_SIZE"

    const/16 v1, 0x2000

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 175
    const-string v0, "BLOCKWISE_STATUS_LIFETIME"

    const v1, 0x493e0

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 177
    const-string v0, "NOTIFICATION_CHECK_INTERVAL"

    const-wide/32 v1, 0x5265c00

    invoke-virtual {p0, v0, v1, v2}, Lo/fmw;->a(Ljava/lang/String;J)Lo/fmw;

    .line 178
    const-string v0, "NOTIFICATION_CHECK_INTERVAL_COUNT"

    const/16 v1, 0x64

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 179
    const-string v0, "NOTIFICATION_REREGISTRATION_BACKOFF"

    const-wide/16 v1, 0x7d0

    invoke-virtual {p0, v0, v1, v2}, Lo/fmw;->a(Ljava/lang/String;J)Lo/fmw;

    .line 181
    const-string v0, "USE_CONGESTION_CONTROL"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/fmw;->e(Ljava/lang/String;Z)Lo/fmw;

    .line 182
    const-string v0, "CONGESTION_CONTROL_ALGORITHM"

    const-string v1, "Cocoa"

    invoke-virtual {p0, v0, v1}, Lo/fmw;->d(Ljava/lang/String;Ljava/lang/String;)Lo/fmw;

    .line 184
    const-string v0, "PROTOCOL_STAGE_THREAD_COUNT"

    invoke-virtual {p0, v0, v3}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 185
    const-string v0, "NETWORK_STAGE_RECEIVER_THREAD_COUNT"

    if-eqz v5, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 186
    const-string v0, "NETWORK_STAGE_SENDER_THREAD_COUNT"

    if-eqz v5, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    :goto_1
    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 188
    const-string v0, "UDP_CONNECTOR_DATAGRAM_SIZE"

    const/16 v1, 0x800

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 189
    const-string v0, "UDP_CONNECTOR_RECEIVE_BUFFER"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 190
    const-string v0, "UDP_CONNECTOR_SEND_BUFFER"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 191
    const-string v0, "UDP_CONNECTOR_OUT_CAPACITY"

    const v1, 0x7fffffff

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 193
    const-string v0, "DEDUPLICATOR"

    const-string v1, "DEDUPLICATOR_MARK_AND_SWEEP"

    invoke-virtual {p0, v0, v1}, Lo/fmw;->d(Ljava/lang/String;Ljava/lang/String;)Lo/fmw;

    .line 194
    const-string v0, "MARK_AND_SWEEP_INTERVAL"

    const-wide/16 v1, 0x2710

    invoke-virtual {p0, v0, v1, v2}, Lo/fmw;->a(Ljava/lang/String;J)Lo/fmw;

    .line 195
    const-string v0, "CROP_ROTATION_PERIOD"

    const/16 v1, 0x7d0

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 196
    const-string v0, "DTLS_RESPONSE_MATCHING"

    const-string v1, "STRICT"

    invoke-virtual {p0, v0, v1}, Lo/fmw;->d(Ljava/lang/String;Ljava/lang/String;)Lo/fmw;

    .line 198
    const-string v0, "HTTP_PORT"

    const/16 v1, 0x1f90

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 199
    const-string v0, "HTTP_SERVER_SOCKET_TIMEOUT"

    const v1, 0x186a0

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 200
    const-string v0, "HTTP_SERVER_SOCKET_BUFFER_SIZE"

    const/16 v1, 0x2000

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 201
    const-string v0, "HTTP_CACHE_RESPONSE_MAX_AGE"

    const v1, 0x15180

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 202
    const-string v0, "HTTP_CACHE_SIZE"

    const/16 v1, 0x20

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 204
    const-string v0, "HEALTH_STATUS_INTERVAL"

    const/16 v1, 0x3c

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 206
    const-string v0, "TCP_CONNECTION_IDLE_TIMEOUT"

    const/16 v1, 0xa

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 207
    const-string v0, "TCP_WORKER_THREADS"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 208
    const-string v0, "TCP_CONNECT_TIMEOUT"

    const/16 v1, 0x2710

    invoke-virtual {p0, v0, v1}, Lo/fmw;->a(Ljava/lang/String;I)Lo/fmw;

    .line 210
    const-string v0, "SECURE_SESSION_TIMEOUT"

    const-wide/32 v1, 0x15180

    invoke-virtual {p0, v0, v1, v2}, Lo/fmw;->a(Ljava/lang/String;J)Lo/fmw;

    .line 211
    const-string v0, "DTLS_AUTO_RESUME_TIMEOUT"

    const-wide/16 v1, 0x7530

    invoke-virtual {p0, v0, v1, v2}, Lo/fmw;->a(Ljava/lang/String;J)Lo/fmw;

    .line 212
    return-void
.end method
