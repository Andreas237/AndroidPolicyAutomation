.class Lo/btj$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/btj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field private static final d:Lo/btj;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 121
    new-instance v0, Lo/btj;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/btj;-><init>(Lo/btj$3;)V

    sput-object v0, Lo/btj$c;->d:Lo/btj;

    return-void
.end method

.method static synthetic a()Lo/btj;
    .locals 1

    .line 120
    sget-object v0, Lo/btj$c;->d:Lo/btj;

    return-object v0
.end method
