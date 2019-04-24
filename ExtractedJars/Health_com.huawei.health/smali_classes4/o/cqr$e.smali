.class Lo/cqr$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final a:Lo/cqr;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 27
    new-instance v0, Lo/cqr;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqr;-><init>(Lo/cqr$5;)V

    sput-object v0, Lo/cqr$e;->a:Lo/cqr;

    .line 28
    return-void
.end method
