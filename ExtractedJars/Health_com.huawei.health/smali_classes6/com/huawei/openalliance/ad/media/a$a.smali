.class Lcom/huawei/openalliance/ad/media/a$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/media/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/lang/String;

.field final b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/media/a$a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/media/a$a;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/huawei/openalliance/ad/media/a$a;

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    if-ne p0, p1, :cond_2

    const/4 v0, 0x1

    return v0

    :cond_2
    move-object v2, p1

    check-cast v2, Lcom/huawei/openalliance/ad/media/a$a;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a$a;->a:Ljava/lang/String;

    iget-object v1, v2, Lcom/huawei/openalliance/ad/media/a$a;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a$a;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    iget-object v1, v2, Lcom/huawei/openalliance/ad/media/a$a;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    if-ne v0, v1, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a$a;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a$a;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/media/a$a;->b:Lcom/huawei/openalliance/ad/media/MediaPlayerAgent;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, -0x1

    :goto_1
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    and-int/2addr v0, v1

    and-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Task ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/openalliance/ad/media/a$a;->a:Ljava/lang/String;

    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/ak;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
