.class public final synthetic Lcom/shopkick/app/account/-$$Lambda$EditProfileScreen$VY4p7uvk2r-6RYhuLPS7-TGxBUA;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnCreateContextMenuListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/account/EditProfileScreen;

.field private final synthetic f$1:Landroid/view/MenuItem$OnMenuItemClickListener;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/account/EditProfileScreen;Landroid/view/MenuItem$OnMenuItemClickListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/account/-$$Lambda$EditProfileScreen$VY4p7uvk2r-6RYhuLPS7-TGxBUA;->f$0:Lcom/shopkick/app/account/EditProfileScreen;

    iput-object p2, p0, Lcom/shopkick/app/account/-$$Lambda$EditProfileScreen$VY4p7uvk2r-6RYhuLPS7-TGxBUA;->f$1:Landroid/view/MenuItem$OnMenuItemClickListener;

    return-void
.end method


# virtual methods
.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 2

    iget-object v0, p0, Lcom/shopkick/app/account/-$$Lambda$EditProfileScreen$VY4p7uvk2r-6RYhuLPS7-TGxBUA;->f$0:Lcom/shopkick/app/account/EditProfileScreen;

    iget-object v1, p0, Lcom/shopkick/app/account/-$$Lambda$EditProfileScreen$VY4p7uvk2r-6RYhuLPS7-TGxBUA;->f$1:Landroid/view/MenuItem$OnMenuItemClickListener;

    invoke-static {v0, v1, p1, p2, p3}, Lcom/shopkick/app/account/EditProfileScreen;->lambda$setupProfilePhotoContextMenu$11(Lcom/shopkick/app/account/EditProfileScreen;Landroid/view/MenuItem$OnMenuItemClickListener;Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method
