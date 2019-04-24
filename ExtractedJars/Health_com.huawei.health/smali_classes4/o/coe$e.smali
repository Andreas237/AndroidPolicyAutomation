.class Lo/coe$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/coe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final c:Lo/coe;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 49
    new-instance v0, Lo/coe;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/coe;-><init>(Lo/coe$4;)V

    sput-object v0, Lo/coe$e;->c:Lo/coe;

    .line 50
    return-void
.end method
