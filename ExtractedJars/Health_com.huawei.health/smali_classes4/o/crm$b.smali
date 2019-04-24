.class Lo/crm$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/crm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final e:Lo/crm;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 68
    new-instance v0, Lo/crm;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/crm;-><init>(Lo/crm$4;)V

    sput-object v0, Lo/crm$b;->e:Lo/crm;

    .line 69
    return-void
.end method
