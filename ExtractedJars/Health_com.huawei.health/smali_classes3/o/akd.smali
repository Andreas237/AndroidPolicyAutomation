.class public Lo/akd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/akd;


# instance fields
.field private c:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Landroid/util/LruCache;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lo/akd;->c:Landroid/util/LruCache;

    .line 19
    return-void
.end method

.method public static b()Lo/akd;
    .locals 1

    .line 22
    sget-object v0, Lo/akd;->d:Lo/akd;

    if-nez v0, :cond_0

    .line 23
    new-instance v0, Lo/akd;

    invoke-direct {v0}, Lo/akd;-><init>()V

    sput-object v0, Lo/akd;->d:Lo/akd;

    .line 25
    :cond_0
    sget-object v0, Lo/akd;->d:Lo/akd;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lo/akd;->c:Landroid/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public c()V
    .locals 1

    .line 37
    iget-object v0, p0, Lo/akd;->c:Landroid/util/LruCache;

    invoke-virtual {v0}, Landroid/util/LruCache;->evictAll()V

    .line 38
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 29
    iget-object v0, p0, Lo/akd;->c:Landroid/util/LruCache;

    invoke-virtual {v0, p1, p2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    return-void
.end method
