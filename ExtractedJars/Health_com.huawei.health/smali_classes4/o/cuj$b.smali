.class Lo/cuj$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cuj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field private static final d:Lo/cuj;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 36
    new-instance v0, Lo/cuj;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cuj;-><init>(Lo/cuj$1;)V

    sput-object v0, Lo/cuj$b;->d:Lo/cuj;

    return-void
.end method

.method static synthetic b()Lo/cuj;
    .locals 1

    .line 35
    sget-object v0, Lo/cuj$b;->d:Lo/cuj;

    return-object v0
.end method
