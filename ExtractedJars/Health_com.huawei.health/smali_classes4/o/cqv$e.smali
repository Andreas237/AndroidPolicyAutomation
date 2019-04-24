.class Lo/cqv$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final e:Lo/cqv;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 24
    new-instance v0, Lo/cqv;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqv;-><init>(Lo/cqv$5;)V

    sput-object v0, Lo/cqv$e;->e:Lo/cqv;

    .line 25
    return-void
.end method
