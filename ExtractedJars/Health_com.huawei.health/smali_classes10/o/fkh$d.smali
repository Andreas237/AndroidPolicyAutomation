.class Lo/fkh$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fkh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field private static final b:Lo/fkh;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 33
    new-instance v0, Lo/fkh;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fkh;-><init>(Lo/fkh$5;)V

    sput-object v0, Lo/fkh$d;->b:Lo/fkh;

    return-void
.end method

.method static synthetic d()Lo/fkh;
    .locals 1

    .line 32
    sget-object v0, Lo/fkh$d;->b:Lo/fkh;

    return-object v0
.end method
