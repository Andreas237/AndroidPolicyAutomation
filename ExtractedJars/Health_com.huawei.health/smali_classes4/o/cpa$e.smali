.class Lo/cpa$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cpa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final e:Lo/cpa;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 33
    new-instance v0, Lo/cpa;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cpa;-><init>(Lo/cpa$1;)V

    sput-object v0, Lo/cpa$e;->e:Lo/cpa;

    .line 34
    return-void
.end method
