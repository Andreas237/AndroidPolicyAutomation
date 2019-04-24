.class Lcom/shopkick/app/shoppinglists/ListAddController$1;
.super Ljava/lang/Object;
.source "ListAddController.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/ListAddController;->maybeAddEntriesToList(Ljava/util/ArrayList;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ListAddController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/ListAddController;)V
    .locals 0

    .line 282
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ListAddController$1;->this$0:Lcom/shopkick/app/shoppinglists/ListAddController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 285
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
