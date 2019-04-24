.class Lo/coy$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/coy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static final e:Lo/coy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 29
    new-instance v0, Lo/coy;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/coy;-><init>(Lo/coy$3;)V

    sput-object v0, Lo/coy$a;->e:Lo/coy;

    .line 30
    return-void
.end method
