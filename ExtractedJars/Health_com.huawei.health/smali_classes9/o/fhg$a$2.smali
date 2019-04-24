.class Lo/fhg$a$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fhg$a;->c([Ljava/lang/String;Ljava/lang/Integer;)Lo/fhg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fhg;

.field final synthetic d:Lo/fhg$a;


# direct methods
.method constructor <init>(Lo/fhg$a;Lo/fhg;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lo/fhg$a$2;->d:Lo/fhg$a;

    iput-object p2, p0, Lo/fhg$a$2;->a:Lo/fhg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 81
    iget-object v0, p0, Lo/fhg$a$2;->a:Lo/fhg;

    invoke-virtual {v0}, Lo/fhg;->dismiss()V

    .line 82
    return-void
.end method
