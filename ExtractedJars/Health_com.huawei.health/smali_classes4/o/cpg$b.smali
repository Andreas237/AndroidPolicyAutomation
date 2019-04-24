.class Lo/cpg$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cpg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final a:Lo/cpg;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 51
    new-instance v0, Lo/cpg;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cpg;-><init>(Lo/cpg$4;)V

    sput-object v0, Lo/cpg$b;->a:Lo/cpg;

    .line 52
    return-void
.end method
