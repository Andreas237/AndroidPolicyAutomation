.class Lo/col$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/col;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static final c:Lo/col;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 84
    new-instance v0, Lo/col;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/col;-><init>(Lo/col$1;)V

    sput-object v0, Lo/col$a;->c:Lo/col;

    .line 85
    return-void
.end method
