.class Lo/cqy$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final a:Lo/cqy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 30
    new-instance v0, Lo/cqy;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqy;-><init>(Lo/cqy$2;)V

    sput-object v0, Lo/cqy$d;->a:Lo/cqy;

    .line 31
    return-void
.end method
