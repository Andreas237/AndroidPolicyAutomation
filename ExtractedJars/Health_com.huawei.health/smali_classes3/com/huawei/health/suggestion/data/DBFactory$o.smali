.class final Lcom/huawei/health/suggestion/data/DBFactory$o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "o"
.end annotation


# static fields
.field private static final b:Lo/btp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 526
    new-instance v0, Lo/btp;

    invoke-direct {v0}, Lo/btp;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$o;->b:Lo/btp;

    return-void
.end method

.method static synthetic a()Lo/btp;
    .locals 1

    .line 525
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$o;->b:Lo/btp;

    return-object v0
.end method
