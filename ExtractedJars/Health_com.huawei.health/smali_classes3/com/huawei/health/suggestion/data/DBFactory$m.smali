.class final Lcom/huawei/health/suggestion/data/DBFactory$m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "m"
.end annotation


# static fields
.field private static final d:Lo/btn;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 506
    new-instance v0, Lo/btn;

    invoke-direct {v0}, Lo/btn;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$m;->d:Lo/btn;

    return-void
.end method

.method static synthetic b()Lo/btn;
    .locals 1

    .line 505
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$m;->d:Lo/btn;

    return-object v0
.end method
