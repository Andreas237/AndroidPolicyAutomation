.class final Lcom/huawei/health/suggestion/data/DBFactory$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# static fields
.field private static final c:Lo/bsj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 498
    new-instance v0, Lo/bsj;

    invoke-direct {v0}, Lo/bsj;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$d;->c:Lo/bsj;

    return-void
.end method

.method static synthetic d()Lo/bsj;
    .locals 1

    .line 497
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$d;->c:Lo/bsj;

    return-object v0
.end method
