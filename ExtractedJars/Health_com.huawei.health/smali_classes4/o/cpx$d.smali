.class Lo/cpx$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cpx;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final d:Lo/cpx;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 39
    new-instance v0, Lo/cpx;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cpx;-><init>(Lo/cpx$4;)V

    sput-object v0, Lo/cpx$d;->d:Lo/cpx;

    .line 40
    return-void
.end method
