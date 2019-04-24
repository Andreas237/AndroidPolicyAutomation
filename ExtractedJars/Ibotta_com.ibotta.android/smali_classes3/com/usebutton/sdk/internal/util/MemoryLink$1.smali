.class Lcom/usebutton/sdk/internal/util/MemoryLink$1;
.super Landroid/util/LruCache;
.source "MemoryLink.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/util/MemoryLink;->getStore()Landroid/util/LruCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/util/LruCache<",
        "Landroid/net/Uri;",
        "Lcom/usebutton/sdk/internal/util/Data;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/util/MemoryLink;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/util/MemoryLink;I)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/MemoryLink$1;->this$0:Lcom/usebutton/sdk/internal/util/MemoryLink;

    invoke-direct {p0, p2}, Landroid/util/LruCache;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected sizeOf(Landroid/net/Uri;Lcom/usebutton/sdk/internal/util/Data;)I
    .locals 0

    const/4 p1, 0x0

    if-nez p2, :cond_0

    return p1

    .line 33
    :cond_0
    iget-object p2, p2, Lcom/usebutton/sdk/internal/util/Data;->mData:[B

    if-nez p2, :cond_1

    return p1

    .line 35
    :cond_1
    array-length p1, p2

    return p1
.end method

.method protected bridge synthetic sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 29
    check-cast p1, Landroid/net/Uri;

    check-cast p2, Lcom/usebutton/sdk/internal/util/Data;

    invoke-virtual {p0, p1, p2}, Lcom/usebutton/sdk/internal/util/MemoryLink$1;->sizeOf(Landroid/net/Uri;Lcom/usebutton/sdk/internal/util/Data;)I

    move-result p1

    return p1
.end method
