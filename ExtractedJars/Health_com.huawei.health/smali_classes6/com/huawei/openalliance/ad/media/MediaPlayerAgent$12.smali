.class Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$12;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/media/MediaPlayer$OnInfoListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$12;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInfo(Landroid/media/MediaPlayer;II)Z
    .locals 5

    const-string v0, "MediaPlayerAgent"

    const-string v1, "onInfo what: %d extra: %d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$12;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->e(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    goto :goto_0

    :sswitch_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent$12;->a:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;->c(Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V

    :goto_0
    const/4 v0, 0x1

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x2bd -> :sswitch_0
        0x2be -> :sswitch_1
    .end sparse-switch
.end method
