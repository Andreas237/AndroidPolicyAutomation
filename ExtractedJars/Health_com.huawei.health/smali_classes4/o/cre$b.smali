.class Lo/cre$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cre;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final b:Lo/cre;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 47
    new-instance v0, Lo/cre;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cre;-><init>(Lo/cre$1;)V

    sput-object v0, Lo/cre$b;->b:Lo/cre;

    .line 48
    return-void
.end method
