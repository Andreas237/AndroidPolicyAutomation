.class public Lcom/huawei/openalliance/ad/media/MediaState;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/media/MediaState$State;
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/openalliance/ad/media/MediaState$State;

.field private final b:[B


# direct methods
.method public constructor <init>()V
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/huawei/openalliance/ad/media/MediaState$State;->IDLE:Lcom/huawei/openalliance/ad/media/MediaState$State;

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaState;->a:Lcom/huawei/openalliance/ad/media/MediaState$State;

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaState;->b:[B

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/media/MediaState$State;)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v4, p0, Lcom/huawei/openalliance/ad/media/MediaState;->b:[B

    monitor-enter v4

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaState;->a:Lcom/huawei/openalliance/ad/media/MediaState$State;

    sget-object v1, Lcom/huawei/openalliance/ad/media/MediaState$State;->END:Lcom/huawei/openalliance/ad/media/MediaState$State;

    if-eq v0, v1, :cond_1

    const-string v0, "MediaState"

    const-string v1, "switchToState: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaState;->a:Lcom/huawei/openalliance/ad/media/MediaState$State;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    :goto_0
    return-void
.end method

.method public a()Z
    .locals 5

    iget-object v2, p0, Lcom/huawei/openalliance/ad/media/MediaState;->b:[B

    monitor-enter v2

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/media/MediaState$1;->a:[I

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaState;->a:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v1}, Lcom/huawei/openalliance/ad/media/MediaState$State;->ordinal()I

    move-result v1

    aget v0, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v3, 0x1

    goto :goto_1

    :goto_0
    const/4 v3, 0x0

    :goto_1
    monitor-exit v2

    return v3

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public getStateCode()I
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaState;->b:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaState;->a:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaState$State;->getCode()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public isNotState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z
    .locals 1
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/media/MediaState;->isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isState(Lcom/huawei/openalliance/ad/media/MediaState$State;)Z
    .locals 3
    .annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
    .end annotation

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaState;->b:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaState;->a:Lcom/huawei/openalliance/ad/media/MediaState$State;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit v1

    return v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/MediaState;->b:[B

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaState;->a:Lcom/huawei/openalliance/ad/media/MediaState$State;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/media/MediaState$State;->toString()Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method
