.class Lo/cqh$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static final e:Lo/cqh;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 40
    new-instance v0, Lo/cqh;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqh;-><init>(Lo/cqh$3;)V

    sput-object v0, Lo/cqh$a;->e:Lo/cqh;

    .line 41
    return-void
.end method
