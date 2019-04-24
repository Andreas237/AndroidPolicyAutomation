.class final Lcom/huawei/health/suggestion/data/DBFactory$r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "r"
.end annotation


# static fields
.field private static final c:Lo/btt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 566
    new-instance v0, Lo/btt;

    invoke-direct {v0}, Lo/btt;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$r;->c:Lo/btt;

    return-void
.end method

.method static synthetic b()Lo/btt;
    .locals 1

    .line 565
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$r;->c:Lo/btt;

    return-object v0
.end method
