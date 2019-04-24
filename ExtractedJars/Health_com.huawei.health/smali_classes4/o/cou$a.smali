.class Lo/cou$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cou;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static final c:Lo/cou;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 39
    new-instance v0, Lo/cou;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cou;-><init>(Lo/cou$2;)V

    sput-object v0, Lo/cou$a;->c:Lo/cou;

    .line 40
    return-void
.end method
