.class Lo/cqk$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final d:Lo/cqk;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 35
    new-instance v0, Lo/cqk;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqk;-><init>(Lo/cqk$3;)V

    sput-object v0, Lo/cqk$e;->d:Lo/cqk;

    .line 36
    return-void
.end method
