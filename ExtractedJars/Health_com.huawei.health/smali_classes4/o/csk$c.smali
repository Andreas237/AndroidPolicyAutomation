.class Lo/csk$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/csk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# static fields
.field public static final e:Lo/csk;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 124
    new-instance v0, Lo/csk;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/csk;-><init>(Lo/csk$4;)V

    sput-object v0, Lo/csk$c;->e:Lo/csk;

    .line 125
    return-void
.end method
