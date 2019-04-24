.class Lo/cqd$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# static fields
.field public static final e:Lo/cqd;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 46
    new-instance v0, Lo/cqd;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqd;-><init>(Lo/cqd$4;)V

    sput-object v0, Lo/cqd$a;->e:Lo/cqd;

    .line 47
    return-void
.end method
