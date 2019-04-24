.class Lo/drz$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/drz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field private static final b:Lo/drz;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 14
    new-instance v0, Lo/drz;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/drz;-><init>(Lo/drz$1;)V

    sput-object v0, Lo/drz$d;->b:Lo/drz;

    return-void
.end method

.method static synthetic d()Lo/drz;
    .locals 1

    .line 13
    sget-object v0, Lo/drz$d;->b:Lo/drz;

    return-object v0
.end method
