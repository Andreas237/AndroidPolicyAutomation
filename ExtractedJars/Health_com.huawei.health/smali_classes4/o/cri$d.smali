.class Lo/cri$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cri;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final e:Lo/cri;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 28
    new-instance v0, Lo/cri;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cri;-><init>(Lo/cri$2;)V

    sput-object v0, Lo/cri$d;->e:Lo/cri;

    .line 29
    return-void
.end method
