.class Lo/cor$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field private static final d:Lo/cor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 38
    new-instance v0, Lo/cor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cor;-><init>(Lo/cor$4;)V

    sput-object v0, Lo/cor$a;->d:Lo/cor;

    .line 39
    return-void
.end method

.method static synthetic d()Lo/cor;
    .locals 1

    .line 34
    sget-object v0, Lo/cor$a;->d:Lo/cor;

    return-object v0
.end method
