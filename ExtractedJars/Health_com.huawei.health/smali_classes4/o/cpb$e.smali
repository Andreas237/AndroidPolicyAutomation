.class Lo/cpb$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cpb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final c:Lo/cpb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 65
    new-instance v0, Lo/cpb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cpb;-><init>(Lo/cpb$4;)V

    sput-object v0, Lo/cpb$e;->c:Lo/cpb;

    .line 66
    return-void
.end method
