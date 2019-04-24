.class final Lcom/huawei/health/suggestion/data/DBFactory$n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/data/DBFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "n"
.end annotation


# static fields
.field private static final e:Lo/bto;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 570
    new-instance v0, Lo/bto;

    invoke-direct {v0}, Lo/bto;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/data/DBFactory$n;->e:Lo/bto;

    return-void
.end method

.method static synthetic c()Lo/bto;
    .locals 1

    .line 569
    sget-object v0, Lcom/huawei/health/suggestion/data/DBFactory$n;->e:Lo/bto;

    return-object v0
.end method
