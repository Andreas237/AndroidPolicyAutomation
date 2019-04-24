.class public Lo/doa;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/doa;->b:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 13
    sget-object v0, Lo/doa;->b:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method
