.class Lo/coj$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/coj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final d:Lo/coj;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 87
    new-instance v0, Lo/coj;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/coj;-><init>(Lo/coj$3;)V

    sput-object v0, Lo/coj$d;->d:Lo/coj;

    .line 88
    return-void
.end method
