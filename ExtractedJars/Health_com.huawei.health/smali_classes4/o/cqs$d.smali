.class Lo/cqs$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final a:Lo/cqs;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 40
    new-instance v0, Lo/cqs;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqs;-><init>(Lo/cqs$1;)V

    sput-object v0, Lo/cqs$d;->a:Lo/cqs;

    .line 41
    return-void
.end method
