.class Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->onAudioFocusChange(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;I)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28$1;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;

    iput p2, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28$1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "onAudioFocusChange %d previous: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28$1;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28$1;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;

    iget-object v3, v3, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v3}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->D(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    iget v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28$1;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28$1;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28$1;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->b(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;)V

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28$1;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->c(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;)V

    :goto_0
    :pswitch_3
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28$1;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget v1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$28$1;->a:I

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->g(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;I)I

    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method
