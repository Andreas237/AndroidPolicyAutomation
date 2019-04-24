.class public Lcom/shopkick/app/adapter/ViewId;
.super Ljava/lang/Object;
.source "ViewId.java"


# static fields
.field private static sequence:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private integer:Ljava/lang/Integer;

.field private parentId:Ljava/lang/Integer;

.field private string:Ljava/lang/String;

.field private viewId:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/shopkick/app/adapter/ViewId;->sequence:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 19
    sget-object v0, Lcom/shopkick/app/adapter/ViewId;->sequence:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/shopkick/app/adapter/ViewId;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/adapter/ViewId;->integer:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/adapter/ViewId;->parentId:Ljava/lang/Integer;

    .line 32
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/adapter/ViewId;->viewId:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/shopkick/app/adapter/ViewId;->string:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 60
    :cond_0
    instance-of v1, p1, Lcom/shopkick/app/adapter/ViewId;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 64
    :cond_1
    check-cast p1, Lcom/shopkick/app/adapter/ViewId;

    .line 67
    iget-object v1, p0, Lcom/shopkick/app/adapter/ViewId;->integer:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    iget-object v3, p1, Lcom/shopkick/app/adapter/ViewId;->integer:Ljava/lang/Integer;

    if-eqz v3, :cond_2

    .line 68
    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 70
    :cond_2
    iget-object v1, p0, Lcom/shopkick/app/adapter/ViewId;->string:Ljava/lang/String;

    if-eqz v1, :cond_3

    iget-object v3, p1, Lcom/shopkick/app/adapter/ViewId;->string:Ljava/lang/String;

    if-eqz v3, :cond_3

    .line 71
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 73
    :cond_3
    iget-object v1, p0, Lcom/shopkick/app/adapter/ViewId;->parentId:Ljava/lang/Integer;

    if-eqz v1, :cond_5

    iget-object v3, p1, Lcom/shopkick/app/adapter/ViewId;->parentId:Ljava/lang/Integer;

    if-eqz v3, :cond_5

    iget-object v4, p0, Lcom/shopkick/app/adapter/ViewId;->viewId:Ljava/lang/Integer;

    if-eqz v4, :cond_5

    iget-object v4, p1, Lcom/shopkick/app/adapter/ViewId;->viewId:Ljava/lang/Integer;

    if-eqz v4, :cond_5

    .line 74
    invoke-virtual {v1, v3}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/shopkick/app/adapter/ViewId;->viewId:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/shopkick/app/adapter/ViewId;->viewId:Ljava/lang/Integer;

    invoke-virtual {v1, p1}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    move v0, v2

    :goto_0
    return v0

    :cond_5
    return v2
.end method

.method public hashCode()I
    .locals 2

    .line 83
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewId;->integer:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {v0}, Ljava/lang/Integer;->hashCode()I

    move-result v0

    return v0

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewId;->string:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 87
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0

    .line 89
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewId;->parentId:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->hashCode()I

    move-result v0

    iget-object v1, p0, Lcom/shopkick/app/adapter/ViewId;->viewId:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public intValue()I
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewId;->integer:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public parentId()Ljava/lang/Integer;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewId;->parentId:Ljava/lang/Integer;

    return-object v0
.end method

.method public stringValue()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewId;->string:Ljava/lang/String;

    return-object v0
.end method

.method public viewId()Ljava/lang/Integer;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/shopkick/app/adapter/ViewId;->viewId:Ljava/lang/Integer;

    return-object v0
.end method
