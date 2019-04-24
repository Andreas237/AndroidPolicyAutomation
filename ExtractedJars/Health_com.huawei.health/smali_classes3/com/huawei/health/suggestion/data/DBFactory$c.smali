.class final Lcom/huawei/health/suggestion/data/DBFactory$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# static fields
.field private static final e:Lo/bth;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 538
    new-instance v0, Lo/bth;

    invoke-direct {v0}, Lo/bth;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$c;->e:Lo/bth;

    return-void
.end method

.method static synthetic e()Lo/bth;
    .locals 1

    .line 537
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$c;->e:Lo/bth;

    return-object v0
.end method
