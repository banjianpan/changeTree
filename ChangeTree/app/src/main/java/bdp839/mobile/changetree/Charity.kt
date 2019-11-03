package bdp839.mobile.changetree

class Charity{
    private var name: String = ""
    private var cur_donation: Double = 0.0
    private var cur_charity: Boolean = false

    fun makeCharity(charity_name: String, current_donations: Double, current_charity: Boolean){
        name = charity_name
        cur_donation = current_donations
        cur_charity = current_charity
    }
    fun getName(): String{
        return name
    }

    fun getDonation(): Double{
        return cur_donation
    }

    fun favoriteCharity(): Boolean{
        return cur_charity
    }
}