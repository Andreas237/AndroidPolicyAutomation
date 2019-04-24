.class Lo/fdj$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fdj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field private static final a:Lo/fdj;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 96
    new-instance v0, Lo/fdj;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/fdj;-><init>(Lo/fdj$3;)V

    sput-object v0, Lo/fdj$e;->a:Lo/fdj;

    return-void
.end method

.method static synthetic b()Lo/fdj;
    .locals 1

    .line 95
    sget-object v0, Lo/fdj$e;->a:Lo/fdj;

    return-object v0
.end method
