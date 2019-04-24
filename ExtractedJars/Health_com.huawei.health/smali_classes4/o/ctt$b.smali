.class Lo/ctt$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ctt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final a:Lo/ctt;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 65
    new-instance v0, Lo/ctt;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ctt;-><init>(Lo/ctt$4;)V

    sput-object v0, Lo/ctt$b;->a:Lo/ctt;

    .line 66
    return-void
.end method
