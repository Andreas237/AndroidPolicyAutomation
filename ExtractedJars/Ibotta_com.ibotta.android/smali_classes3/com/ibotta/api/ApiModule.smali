.class public final enum Lcom/ibotta/api/ApiModule;
.super Ljava/lang/Enum;
.source "ApiModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/api/ApiModule;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/api/ApiModule;

.field public static final enum INSTANCE:Lcom/ibotta/api/ApiModule;


# instance fields
.field private httpHeaders:Lcom/ibotta/api/HttpHeaders;

.field private lock:Ljava/util/concurrent/locks/Lock;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 15
    new-instance v0, Lcom/ibotta/api/ApiModule;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/ApiModule;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/api/ApiModule;->INSTANCE:Lcom/ibotta/api/ApiModule;

    const/4 v0, 0x1

    .line 14
    new-array v0, v0, [Lcom/ibotta/api/ApiModule;

    sget-object v1, Lcom/ibotta/api/ApiModule;->INSTANCE:Lcom/ibotta/api/ApiModule;

    aput-object v1, v0, v2

    sput-object v0, Lcom/ibotta/api/ApiModule;->$VALUES:[Lcom/ibotta/api/ApiModule;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 16
    new-instance p1, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lcom/ibotta/api/ApiModule;->lock:Ljava/util/concurrent/locks/Lock;

    return-void
.end method

.method private getSafely(Ljava9/util/function/Supplier;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava9/util/function/Supplier<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/ibotta/api/ApiModule;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 33
    :try_start_0
    invoke-interface {p1}, Ljava9/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    iget-object v0, p0, Lcom/ibotta/api/ApiModule;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/ibotta/api/ApiModule;->lock:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 36
    throw p1
.end method

.method public static synthetic lambda$getHttpHeaders$0(Lcom/ibotta/api/ApiModule;)Lcom/ibotta/api/HttpHeaders;
    .locals 2

    .line 21
    iget-object v0, p0, Lcom/ibotta/api/ApiModule;->httpHeaders:Lcom/ibotta/api/HttpHeaders;

    if-nez v0, :cond_0

    .line 22
    new-instance v0, Lcom/ibotta/api/HttpHeaders;

    sget-object v1, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-direct {v0, v1}, Lcom/ibotta/api/HttpHeaders;-><init>(Lcom/ibotta/api/ApiContext;)V

    iput-object v0, p0, Lcom/ibotta/api/ApiModule;->httpHeaders:Lcom/ibotta/api/HttpHeaders;

    .line 24
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/ApiModule;->httpHeaders:Lcom/ibotta/api/HttpHeaders;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/api/ApiModule;
    .locals 1

    .line 14
    const-class v0, Lcom/ibotta/api/ApiModule;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/api/ApiModule;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/api/ApiModule;
    .locals 1

    .line 14
    sget-object v0, Lcom/ibotta/api/ApiModule;->$VALUES:[Lcom/ibotta/api/ApiModule;

    invoke-virtual {v0}, [Lcom/ibotta/api/ApiModule;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/api/ApiModule;

    return-object v0
.end method


# virtual methods
.method public getHttpHeaders()Lcom/ibotta/api/HttpHeaders;
    .locals 1

    .line 20
    new-instance v0, Lcom/ibotta/api/-$$Lambda$ApiModule$-oGYBX9LFd0SL3rRzuQOjW2MOGM;

    invoke-direct {v0, p0}, Lcom/ibotta/api/-$$Lambda$ApiModule$-oGYBX9LFd0SL3rRzuQOjW2MOGM;-><init>(Lcom/ibotta/api/ApiModule;)V

    invoke-direct {p0, v0}, Lcom/ibotta/api/ApiModule;->getSafely(Ljava9/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/HttpHeaders;

    return-object v0
.end method
