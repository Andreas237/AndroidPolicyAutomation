.class final Lcom/huawei/health/suggestion/data/DBFactory$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# static fields
.field private static final c:Lo/btc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 558
    new-instance v0, Lo/btc;

    invoke-direct {v0}, Lo/btc;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$b;->c:Lo/btc;

    return-void
.end method

.method static synthetic a()Lo/btc;
    .locals 1

    .line 557
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$b;->c:Lo/btc;

    return-object v0
.end method
