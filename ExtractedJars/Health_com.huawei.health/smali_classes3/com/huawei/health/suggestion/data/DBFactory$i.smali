.class final Lcom/huawei/health/suggestion/data/DBFactory$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "i"
.end annotation


# static fields
.field private static final e:Lo/btd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 550
    new-instance v0, Lo/btd;

    invoke-direct {v0}, Lo/btd;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$i;->e:Lo/btd;

    return-void
.end method

.method static synthetic b()Lo/btd;
    .locals 1

    .line 549
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$i;->e:Lo/btd;

    return-object v0
.end method
