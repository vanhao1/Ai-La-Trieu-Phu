package tdc.edu.vn.ailatrieuphu_n7_project.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.widget.LinearLayout;

import tdc.edu.vn.ailatrieuphu_n7_project.R;

public class ThongTinDialog extends Dialog {
    public ThongTinDialog(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.thongtinnhom_dialog);
        getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
    }
}
